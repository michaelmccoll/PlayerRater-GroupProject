import React from 'react';
import {useState} from 'react';
import './Rater.css';
import RaterList from '../components/RaterList';

const Rater = ({teamId,playerId}) => {

    const [teamsheet,setTeamsheet] = useState(
        [
        {id: 1,
        first_name: "Lionel",
        second_name: "Messi",
        rating: 9
        },
        {id: 2,
        first_name: "Jordi",
        second_name: "Alba",
        rating: 6
        },
        {id: 3,
        first_name: "David",
        second_name: "Marshall",
        rating: 2
        },
        {id: 4,
        first_name: "Andy",
        second_name: "Robertson",
        rating: 7
        },
        {id: 5,
        first_name: "Cristiano",
        second_name: "Ronaldo",
        rating: 1
        }
    ])

    const handleRateChange = (newRating, player_id) => {
        for (const player of teamsheet) {
            if (player_id === player.id) {
                player.rating = newRating
            }
        }
        setTeamsheet([...teamsheet])
    }   

    return(
        <>
            <h2>Rate Teammates vs Gorgie FC</h2>
            <RaterList teamsheet={teamsheet} handleChange={(newRating, player_id) => handleRateChange(newRating, player_id)}/>
        </>
    )
}

export default Rater;