
import './App.css';
import React from 'react';
// import {useState} from 'react';
import {BrowserRouter as Router, Route, Switch}  from 'react-router-dom';
import Header from './components/Header';
import NavBar from './components/NavBar';
import Team from './containers/Team';
import Stats from './containers/Stats';
import Rater from './containers/Rater';
import Matches from './containers/Matches';
import Profile from './containers/Profile';
import Error from './containers/Error';

function App() {
  return (
    <Router>
      <>
      <Header/>
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
// hello
export default App;
