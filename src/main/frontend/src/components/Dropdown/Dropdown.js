import react, { useState } from "react";
import {
    Select,
    MenuItem,
    FormControl,
    InputLabel,
    makeStyles
    } from "@material-ui/core";

const useStyle = makeStyles(theme => ({
    formControl: {
        minWidth: 100,
        paddingBottom: "20px"
    },
    dropdown: {
        position: 'absolute',
        left: '50%'
    }
}));
//Dropdown hook
export default function Dropdown(props){
    const classes = useStyle();
    const[check, setCheck] = useState("");

    const {dropDownItems, onChange } = props;

    const handleChange = e => {
        setCheck(e.target.value);
        console.log("selected value: "+e.target.value)
    }

    return (
        <div className={classes.dropdown}>
            <FormControl className={classes.formControl}>
                <InputLabel>{dropDownItems.label}</InputLabel>
                <Select onChange={onChange}>
                     <MenuItem value={dropDownItems.values[0]}>{props.dropDownItems.options[0]}</MenuItem>
                     <MenuItem value={dropDownItems.values[0]}>{props.dropDownItems.options[1]}</MenuItem>

                </Select>
                </FormControl>
        </div>
    );
}