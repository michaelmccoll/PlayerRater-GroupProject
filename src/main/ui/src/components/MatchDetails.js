import './MatchDetails.css';

const MatchDetails = ({match}) =>{

    if (!match.venue){
        return(
        <>
            <hr/>
            <h4>{match.team} {match.home_score} - {match.away_score} {match.opposition}</h4>
        </>
        )
    }

    return(
        <>
            <hr/>
            <h4>{match.opposition} {match.home_score} - {match.home_score} {match.team}</h4>
        </>
    )
}

export default MatchDetails;