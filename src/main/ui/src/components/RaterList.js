import RaterPlayer from "./RaterPlayer";

const RaterList = ({teamsheet}) => {

    const raterNodes = teamsheet.map(team => {
        return(
            <RaterPlayer team={team} key={team.id}></RaterPlayer>
        )
    })
    return(
        <>
            {raterNodes}
            <button>Submit</button>
        </>
    )
}

export default RaterList;


