import React from 'react'
import { makeStyles } from "@material-ui/core/styles";
import {IconButton} from "@material-ui/core";
import Icon from '@material-ui/core/Icon';
import SaveIcon from '@material-ui/icons/Save';
import DeleteIcon from '@material-ui/icons/Delete';
import Button from "@material-ui/core/Button";
import CloudUploadIcon from '@material-ui/icons/CloudUpload';

const useStyles = makeStyles((theme) => ({
    button: {
        margin: theme.spacing(1),
        fontSize: '12px',
    },
}));

export default function DeleteLabelButton() {
    const classes = useStyles();


    return(
        <div>
            <Button
                variant="contained"
                color="secondary"
                className={classes.button}
                startIcon={<DeleteIcon/>}
            >
                Delete
            </Button>
        </div>
    )
}

