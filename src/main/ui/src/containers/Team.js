import {useState, useEffect} from 'react';
import './Team.css';

import Stats from './Stats';
import Rater from './Rater';
import Matches from './Matches';
import Profile from './Profile';


const Team = ({teams, players, loaded, handleTeamSelect, handlePlayerSelect}) => {

     

    const [teamSelect, setTeamSelect] = useState(null)
    const [playerSelect, setPlayerSelect] = useState(null)

    if(!loaded) {
        return(
            <p>...loading</p>
        )
    }


    const setTeamState = (event) => {
        // setTeamSelect(event.target.value);
        handleTeamSelect(event.target.value)
    }
    const setPlayerState = (event) => {
        // setPlayerSelect(event.target.value);
        handlePlayerSelect(event.target.value)
    }

   

    const teamOptionNodes = teams.map(team => {
        return(
            <option placeholder="Select Your Team" key={team.id} value={team.id}>{team.name}</option>
        )
      })
    
    const playerOptionNodes = players.map(player => {
          return(
              <option key={player.id} value={player.id}>{player.first_name} {player.second_name}</option>
          )
      })

    return(

        <>
            
            <label htmlFor="teams">Select Team</label>
            <select onChange={setTeamState} name="teams" id="teams">
                <option disabled defaultValue>Select a Team</option>
                {teamOptionNodes}
            </select>

            <label htmlFor="players">Select Player</label>
            <select onChange={setPlayerState} name="players" id="players">
                <option disabled defaultValue>Select a Player</option>
                {playerOptionNodes}
            </select>
            
        </>
    )
}

export default Team;