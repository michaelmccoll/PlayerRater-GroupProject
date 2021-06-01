import {useState, useEffect} from 'react';
import React from 'react';
import './Matches.css';
import MatchList from '../components/MatchList';

const Matches = ({teamId,playerId}) => {

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
    },[])

    return(
        <>
            <h2>Latest Matches</h2>
            <MatchList matches={matches}/>
        </>
    )
}

export default Matches;