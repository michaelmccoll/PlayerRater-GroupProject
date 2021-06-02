import {useState} from 'react';
import './AddPlayer.css';

const AddPlayer =()=>{

    const [newPlayerForm,setNewPlayerForm] = useState({
        newPlayerFirstName:'',
        newPlayerSecondName:'',
        newPlayerAge:'',
        newPlayerPosition:'',
        newPlayerManagement:'',
        newPlayerTeam:''
    })

    const handlePlayerSubmit =(event) => {
        const newState = {...newPlayerForm};
        newState[event.target.name] = parseInt(event.target.value);
        setNewPlayerForm(newState);
    }

    return(
        <>
            <h3>Add New Player</h3>
            <form>
                <div>
                    <label htmlFor="newPlayerFirstName">First Name: </label>
                    <input type="text" name="newPlayerFirstName" id="newPlayerFirstName" />
                </div>
                <div>
                    <label htmlFor="newPlayerSecondName">Second Name: </label>
                    <input type="text" name="newPlayerSecondName" id="newPlayerSecondName" />
                </div>
                <div>
                    <label htmlFor="newPlayerAge">Age: </label>
                    <input type="text" name="newPlayerAge" id="newPlayerAge" />
                </div>
                <div>
                    <label htmlFor="newPlayerPosition">Position: </label>
                    <input type="text" name="newPlayerPosition" id="newPlayerPosition" />
                </div>
                <div>
                    <label htmlFor="newPlayerManagement">Management?: </label>
                    <input type="text" name="newPlayerManagement" id="newPlayerManagement" />
                </div>
                <div>
                    <label htmlFor="newPlayerTeam">Team: </label>
                    <input type="text" name="newPlayerTeam" id="newPlayerTeam" />
                </div>
                <input onClick={handlePlayerSubmit} type="submit" value="submit"></input>
            </form>
        </>
    )
    }
    export default AddPlayer;