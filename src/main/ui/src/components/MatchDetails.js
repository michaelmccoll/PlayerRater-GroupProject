import './MatchDetails.css';

const MatchDetails = ({match}) =>{

    if (!match.venue){
        return(
        <>
            <hr/>
            <h3>{match.team} {match.home_score} - {match.away_score} {match.opposition}</h3>
        </>
        )
    }

    return(
        <>
            <hr/>
            <h3>{match.opposition} {match.home_score} - {match.home_score} {match.team}</h3>
        </>
    )
}

export default MatchDetails;