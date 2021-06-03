import {HashRouter, Link} from 'react-router-dom';
import addTeam from '../imgs/icons/square.png';
import addPlayer from '../imgs/icons/addUser.png';
import addMatch from '../imgs/icons/matches.png';
import {useState} from 'react';
import './Menu.css';

const Menu =()=>{

    return(
        <>
            <h3>Admin Page</h3>

            <Link className="nonHighlight" to="/addTeam"><img className="admin" src={addTeam}></img>Add Team</Link>

            <Link className="nonHighlight" to="/addPlayer"><img className="admin" src={addPlayer}></img>Add Player</Link>

            <Link className="nonHighlight" to="/addMatch"><img className="admin" src={addMatch}></img>Add Match</Link>
           
        </>
    )
}

export default Menu;