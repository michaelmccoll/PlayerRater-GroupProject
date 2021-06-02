
import './App.css';
import React from 'react';
import {useState,useEffect} from 'react';
import {BrowserRouter as Router, Route, Switch}  from 'react-router-dom';
import Header from './components/Header';
import NavBar from './components/NavBar';
import Menu from './components/Menu';
import Team from './containers/Team';
import Stats from './containers/Stats';
import Rater from './containers/Rater';
import Matches from './containers/Matches';
import Profile from './containers/Profile';
import AddMatch from './components/Matches/AddMatch';
import Error from './containers/Error';

function App() {
  
  const [teamSelect, setTeamSelect] = useState(0)
  const [playerSelect, setPlayerSelect] = useState(0)
  const [teams, setTeams] = useState([])
  const [players, setPlayers] = useState([])
  const [loaded, setLoaded] = useState(false)

  const getTeams = () => {
      fetch(`http://localhost:8080/teams`)
      .then(res => res.json())
      .then(data => setTeams(data))
      .then(() => setLoaded(true))
  }

  const getPlayers = () => {
      fetch(`http://localhost:8080/players`)
      .then(res => res.json())
      .then(data => setPlayers(data))
      .then(() => setLoaded(true))
  }

  useEffect(()=>{
      getTeams();
      getPlayers();
  },[])

  const getTeamId = (selectedTeamId) => {
    setTeamSelect(selectedTeamId)
  }
  const getPlayerId = (selectedTeamId) => {
    setPlayerSelect(selectedTeamId)
  }

  return (
    <Router>
      <>
      <Header/>
      <NavBar/>
      <Switch>
      <Route exact path="/">
        <Team teams={teams} players={players} loaded={loaded} handleTeamSelect={(selectedTeam) => getTeamId(selectedTeam)} handlePlayerSelect={(selectedPlayer) => getPlayerId(selectedPlayer)}/>
      </Route>

      <Route path="/stats" component={Stats}>
        <Stats playerId={playerSelect} teamId={teamSelect}/>
      </Route>

      <Route path="/rater">
        <Rater playerId={playerSelect} teamId={teamSelect}/>
      </Route>

      <Route path="/matches" component={Matches}>
        <Matches playerId={playerSelect} teamId={teamSelect}/>
      </Route>

      <Route path="/profile" component={Profile}>
        <Profile playerId={playerSelect} teamId={teamSelect}/>
      </Route>

      <Route path="/addMatch">
        <AddMatch/>
      </Route>
      <Route path="/menu">
        <Menu/>
      </Route>

      <Route component={Error}/>
      </Switch>
      </>
    </Router>
  );
}

export default App;
