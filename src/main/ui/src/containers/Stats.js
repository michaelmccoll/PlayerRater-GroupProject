import {useState, useEffect} from 'react';
import React from 'react';
import './Stats.css';

const Stats = ({teamId,playerId}) => {

    const [stats,setStats] = useState([])
    const [loaded, setLoaded] = useState(false);

    const statsNodes = teamId.teamsheet.map(player => {
        return(
            <tr>
            <td>{player.first_name} {player.second_name}</td>
            <td>{player.matches.size}</td>
            <td>{player.goals}</td>
            <td>{player.assists}</td>
            <td>{player.rating}</td>
        </tr>
        )
    })

    return(
        <div>
            <table>
                <thead>
                    <th>Player</th>
                    <th>Games</th>
                    <th>Goals</th>
                    <th>Assists</th>
                    <th>Rating</th>
                </thead>
               
                <tbody>
                    {statsNodes}
                </tbody>

            </table>
        </div>
        )
    
}

export default Stats;