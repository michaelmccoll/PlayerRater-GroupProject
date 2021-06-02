import {useState} from 'react';

const AddMatch = ({}) => {

    const [date, setDate] = useState(null)
    const [ranked, setRanked] = useState(null)
    const [opposition, setOpposition] = useState(null)
    const [homeTeam, setHomeTeam] = useState(null)
    const [homeScore, setHomeScore] = useState(null)
    const [awayScore, setAwayScore] = useState(null)
    const [teamsheet, setTeamsheet] = useState(null)
    const [stats, setStats] = useState(null)
    const [team, setTeam] = useState(null)
    const [ratings, setRatings] = useState(null)


    const setDateState = (event) => {
        setDate(event.target.value)
    }
    const setRankedState = (event) => {
        setRanked(event.target.value)
    }
    const setOppositionState = (event) => {
        setOpposition(event.target.value)
    }
    const setHomeTeamState = (event) => {
        setHomeTeam(event.target.value)
    }

    const addMatch = () => {
        fetch('localhost:3000/matches', {
            method: 'post',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify({
              date: date,
              ranked: ranked,
              opposition: opposition,
              homeTeam: homeTeam
            })
          })
          .then(response=>response.json())
          .then(data=>{})}

    return(
        <>

        </>
    )
}

export default AddMatch;