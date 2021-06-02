import RaterPlayer from "./RaterPlayer";

const RaterList = ({teamsheet, handleChange}) => {

    

    const raterNodes = teamsheet.map(player => {
        return(
            <RaterPlayer player={player} key={player.id} handleChange={handleChange}></RaterPlayer>
        )
    })

    return(
        <>
            {raterNodes}
        </>
    )
}

export default RaterList;


