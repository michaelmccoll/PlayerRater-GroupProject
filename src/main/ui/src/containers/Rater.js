import React from 'react';
import {useState} from 'react';
import './Rater.css';
import RaterList from '../components/RaterList';

const Rater = () => {

    const [teamsheet,setTeamsheet] = useState(
        [
        {id: 1,
        first_name: "Lionel",
        second_name: "Messi",
        },
        {id: 2,
        first_name: "Jordi",
        second_name: "Alba",
        },
        {id: 3,
        first_name: "David",
        second_name: "Marshall",
        },
        {id: 4,
        first_name: "Andy",
        second_name: "Robertson",
        },
        {id: 5,
        first_name: "Cristiano",
        second_name: "Ronaldo",
        }
    ])

    // const [loaded, setLoaded] = useState(false);

    // const getTeamsheet = () => {
    //     fetch(`https://localhost:8080/matches/{id}/teamsheet`)
    //     .then(res => res.json())
    //     .then(data => setTeamsheet(data))
    //     .then(() => setLoaded(true))
    // }

    // useEffect(()=>{
    //     getTeamsheet();
    // })

    return(
        <>
            <h2>Rate Teammates vs Gorgie FC</h2>
            <RaterList teamsheet={teamsheet}/>
        </>
    )
}

export default Rater;