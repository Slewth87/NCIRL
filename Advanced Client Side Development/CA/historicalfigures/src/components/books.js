import { useState, useEffect } from "react";
import axios from 'axios';

function Books(props) {
    const [bookTitle, setBookTitle] = useState('');
    const [year, setYear] = useState(0);
    const [url, setURL] = useState('');
    const [bookInfo, setBookInfo] = useState([]);
    const [used, setUsed] = useState(false);
    const [err, setErr] = useState('')

    useEffect(async function() {
        try {
            var data = await axios('https://www.googleapis.com/books/v1/volumes', {params: {q: props.query, key: 'AIzaSyD9AyhB8F--bj5fLXUp5fMnGxDy0VXLAt0'}});
            setBookInfo(data.data.items);
            setUsed(true);
            console.log(data.data.items)
        } catch(e) {
            setErr("No Books Available")
        }
    }, [])

    if (used) {
        return (
            <div>
                <h3>Related Reading:</h3>
                    {
                        bookInfo.map(function(i, index) {
                            if (!i.volumeInfo.imageLinks || !i.volumeInfo.infoLink || !i.volumeInfo.authors || !i.volumeInfo.publishedDate || !i.volumeInfo.description) {
                                console.log("Book excluded for missing data")
                            } else {
                                return (
                                    <a className="row mb-1 rounded bg-light text-dark align-items-center" href={i.volumeInfo.infoLink} key={index}>
                                            <div className="col-lg-2">
                                                <img className="border border-5 border-light" src={i.volumeInfo.imageLinks.smallThumbnail}/>
                                            </div>
                                            <div className="col-lg-8">
                                                <div className="row">
                                                    <h4>{i.volumeInfo.title} by {i.volumeInfo.authors[0]}</h4>
                                                </div>
                                                <div className="row text-muted">
                                                    <p>Published: ({i.volumeInfo.publishedDate})</p>
                                                </div>
                                                <div className="row">
                                                    <p>{i.volumeInfo.description}</p>
                                                </div>
                                            </div>
                                    </a>
                                )
                            }
                        })
                    }
            </div>
        )
    } else {
        return (
            <div><h2>{err}</h2></div>
        )
    }
}

export default Books;