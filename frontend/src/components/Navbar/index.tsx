import {ReactComponent as Githubtop} from 'assets/img/github.svg';
import './styles.css';

function Navbar() {

 return (
     <header>
          <nav className="container">
              <div className="dsmovie-nav-content">
                 <h1>DSmovie</h1>
                 <a href="https://github.com/morsce">
                      <div className="dsmovie-contact-container">
                          <Githubtop />
                          <p className ="dsmovie-contact-link"> /devgo </p>
                      </div> 
                 </a>
              </div>
          </nav>
     </header>
  );
}

export default Navbar;