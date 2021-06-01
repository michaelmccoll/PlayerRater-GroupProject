import {useState, useEffect} from 'react';
import React from 'react';
import './Matches.css';
import MatchList from '../components/MatchList';

const Matches = () => {

    const [matches, setMatch] = useState([])
    const [loaded, setLoaded] = useState(false);

    const getMatches = () => {
        fetch(`http://localhost:8080/matches`)
        .then(res => res.json())
        .then(data => setMatch(data))
        .then(() => setLoaded(true))
    }

    useEffect(()=>{
        getMatches();
    })

    return(
        <>
            <h2>Latest Matches</h2>
            <MatchList matches={matches}/>
        </>
    )
}

export default Matches;


// [
//     {id: 1,
//     opposition: "Gorgie FC",
//     venue: true,
//     home_score: 2,
//     away_score: 3,
//     team: "Leith Walkers"
//     },
//     {id: 2,
//     opposition: "Stockbridge Utd",
//     venue: false,
//     home_score: 4,
//     away_score: 1,
//     team: "Leith Walkers"
//     },
//     {id: 3,
//     opposition: "Portobello Pirates",
//     venue: true,
//     home_score: 2,
//     away_score: 3,
//     team: "Leith Walkers",
//     }
// ]