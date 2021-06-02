import {useState, useEffect} from 'react';
import React from 'react';
import './Stats.css';

const Stats = ({teamId,playerId}) => {

    const [stats,setStats] = useState([])
    const [loaded, setLoaded] = useState(false);

    // Backend API could be changed to "/stats/player.id" rather than the "id of stat"
    const getStats = () => {
        fetch(`http://localhost:8080/players/${playerId}`)
        .then(res => res.json())
        .then(data => setStats(data))
        .then(() => setLoaded(true))
    }

    useEffect(()=>{
        getStats();
    },[])

    return(
        <div>
            {/* Last 5 match ratings */}
            <h2>Player Stats</h2>
            {/* Put in a table of stats here */}
            <h4>All the stats go here...</h4>
        </div>
        )
    
}

export default Stats;