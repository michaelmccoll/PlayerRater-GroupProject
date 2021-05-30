
import './App.css';
import React from 'react';
// import {useState} from 'react';
import {BrowserRouter as Router, Route, Switch}  from 'react-router-dom';
import NavBar from './components/NavBar';
import Team from './components/Team';
import Stats from './components/Stats';
import Rater from './components/Rater';
import Matches from './components/Matches';
import Profile from './components/Profile';
import Error from './components/Error';

function App() {
  return (
    <Router>
      <>
      <NavBar/>
      <Switch>
      <Route exact path="/" component={Team}/>
      <Route path="/stats" component={Stats}/>
      <Route path="/rater" component={Rater}/>
      <Route path="/matches" component={Matches}/>
      <Route path="/profile" component={Profile}/>
      <Route component={Error}/>
      </Switch>
      </>
    </Router>
  );
}

export default App;
