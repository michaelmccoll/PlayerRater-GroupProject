
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
  
  const [teamSelect, setTeamSelect] = useState(null)
  const [playerSelect, setPlayerSelect] = useState(0)
  const [teams, setTeams] = useState([])
  const [players, setPlayers] = useState([])
  const [latestMatch, setLatestMatch] = useState(null)
  const [loaded, setLoaded] = useState(false)

  const getTeams = () => {
      fetch(`http://localhost:8080/teams`)
      .then(res => res.json())
      .then(data => {
        setTeams(data)
        setTeamSelect(data[0])
      })
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
      // getLatestMatch()
  },[])

  useEffect(() => {
    if (teamSelect) {
      getLatestMatch()
    }
  }, [teamSelect])



  

  const getTeamId = (selectedTeamId) => {
    for (const team of teams ) {
      if (team.id == selectedTeamId) {
        setTeamSelect(team)
      }
    }
  }

  const getLatestMatch = () => {
    if (teamSelect) {
      const match = teamSelect.matches.slice(-1)[0]
      setLatestMatch(match)
    }
  }

  const getPlayerId = (selectedTeamId) => {
    setPlayerSelect(selectedTeamId)
  }

  const handleRateChange = (newRating, player_id) => {
    for (const player of players) {
        if (player_id === player.id) {
            player.ratings.push(newRating)
        }
    }
    console.log(newRating, player_id);
    setPlayers([...players])
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
        <Rater playerId={playerSelect} match={latestMatch} handleChange={(newRating, player_id) => handleRateChange(newRating, player_id)}/>
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
