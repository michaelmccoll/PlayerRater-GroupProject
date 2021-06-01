import './MatchDetails.css';

const MatchDetails = ({match}) =>{

    if (!match){
        return(
            <h2>Loading...</h2>
        )
    }

    if (!match.homeTeam){
        return(
        <>
            <hr/>
            <h4>{match.teamsheet[1].team.name} {match.homeScore} - {match.awayScore} {match.opposition}</h4>
        </>
        )
    }

    return(
        <>
            <hr/>
            <h4>{match.opposition} {match.homeScore} - {match.homeScore} {match.teamsheet[1].team.name}</h4>
        </>
    )
}

export default MatchDetails;