import { useState } from "react";
import axios from "axios";
import Uni from "./Uni";

function UniList() {
    const [uniList, setUniList] = useState([]);
    const [query, setQuery] = useState('');

    function handleSearchQuery(e) {
        e.preventDefault();
        setQuery(e.target.value);
    }

    async function searchUniList(e) {
        e.preventDefault();
        var res = await axios.get('http://universities.hipolabs.com/search', {params: { country: query}});
        setUniList(res.data);
    }

    return (
        <div>
            <input value={query} onChange={handleSearchQuery}/>
            <button onClick={searchUniList}>Search</button>
            <ul>
                {
                    uniList.map(function(i, index) {
                        return (
                            <li key={index}>
                                <Uni country_code={i.alha_two_code} name={i.name} web_page={i.web_pages[0]}/>
                            </li>
                        )
                    })
                }
            </ul>
        </div>
    )
}

export default UniList;