import MatchDetails from "./MatchDetails"

const MatchList = ({matches}) => {

    const matchNodes = matches.map(match => {
        return(

            <MatchDetails match={match} key={match.id}></MatchDetails>
        )
    })
    return(
        <>
            {matchNodes}
        </>
    )
}

export default MatchList;
