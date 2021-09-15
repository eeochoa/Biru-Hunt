import React from 'react';
import Dropdown from "../components/Dropdown/Dropdown";
import Table from "../components/Table/Table";
import {makeStyles} from "@material-ui/core/styles";

const useStyle = makeStyles((theme) => ({
        linkbutton: {
            textDecoration: 'none',
        },
        positionlabelbutton:{
            float: 'right',

        }
    })
)
export default function Home() {

    return(
        <div>
            <Table />
        </div>
    )
}
