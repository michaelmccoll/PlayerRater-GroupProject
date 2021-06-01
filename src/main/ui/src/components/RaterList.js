import RaterPlayer from "./RaterPlayer";

const RaterList = ({teamsheet, handleChange}) => {

    const raterNodes = teamsheet.map(team => {
        return(
            <RaterPlayer team={team} key={team.id} handleChange={handleChange}></RaterPlayer>
        )
    })
    return(
        <>
            {raterNodes}
            {/* <button>Submit</button> */}
        </>
    )
}

export default RaterList;


