import React from 'react';
import {useState} from 'react';
import './Rater.css';
import RaterList from '../components/RaterList';

const Rater = ({match, handleChange}) => {

    if(!match) {
        return (
            <p>....what the fuck are you doing</p>
        )
    }

    return(
        <>
            <h2>Rate Teammates vs Gorgie FC</h2>
            <RaterList teamsheet={match.teamsheet} handleChange={handleChange}/>
        </>
    )
}

export default Rater;