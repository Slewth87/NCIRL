import MyCarousel from "../components/myCarousel";

function Home() {
    return (
        <div className="container-fluid">
            <MyCarousel/>
            <div className="row justify-content">
                <div className="col-7 mx-auto">
                    <h2>Irish Historical Figures</h2>
                    <p>When you add up the figures, over 10 million men and women left Ireland over the centuries. But Irish history is more than just a long list of names, dates and statistics. . .</p>
                    <p>The interactive exhibitions at EPIC The Irish Emigration Museum explore why they left, as well as the lasting legacies of some famous Irish people in history. Here’s just a few your kids will want to hear about. . .</p><br/>
                    <p className="linking">Find out more about EPIC: The Irish Immigration Museum <a href="http://epicchq.com/" target="_blank">here</a>.</p><br/>
                </div>
            </div>
        </div>
    )
}

export default Home;