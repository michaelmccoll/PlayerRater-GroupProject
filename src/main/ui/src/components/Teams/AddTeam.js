import {useState} from 'react';
import './AddTeam.css';

const AddTeam =()=>{

    const [newTeamForm,setNewTeamForm] = useState({
        newTeamName:'',
        newTeamLocation:'',
        newTeamLeague:'',
        newTeamPrimaryColour:'',
        newTeamSecondaryColour:'',
        newTeamBadge:''
    });

    const handleTeamSubmit =(event) => {
        const newState = {...newTeamForm};
        newState[event.target.name] = parseInt(event.target.value);
        setNewTeamForm(newState);
    }

    return(
        <>
        <h3>Add New Team</h3>
            <form>
                <div>
                    <label htmlFor="newTeamName">Team Name: </label>
                    <input type="text" name="newTeamName" id="newTeamName" />
                </div>
                <div>
                    <label htmlFor="newTeamLocation">Location: </label>
                    <input type="text" name="newTeamLocation" id="newTeamLocation" />
                </div>
                <div>
                    <label htmlFor="newTeamLeague">League: </label>
                    <input type="text" name="newTeamLeague" id="newTeamLeague" />
                </div>
                <div>
                    <label htmlFor="newTeamPrimaryColour">Primary colour: </label>
                    <input type="text" name="newTeamPrimaryColour" id="newTeamPrimaryColour" />
                </div>
                <div>
                    <label htmlFor="newTeamSecondaryColour">Secondary Colour: </label>
                    <input type="text" name="newTeamSecondaryColour" id="newTeamSecondaryColour" />
                </div>
                <div>
                    <label htmlFor="newTeamBadge">Badge: </label>
                    <input type="text" name="newTeamBadge" id="newTeamBadge" />
                </div>
                <input onClick={handleTeamSubmit} type="submit" value="submit"></input>
            </form>
        </>
    )
    }
    export default AddTeam;