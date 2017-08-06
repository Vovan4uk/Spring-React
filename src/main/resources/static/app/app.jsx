import React from "react";
import ReactDom from "react-dom";
import client from "./client";

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {users: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/users'}).done(response => {
            this.setState({users: response.entity._embedded.users});
        });
    }

    render() {
        return (
            <UserList users={this.state.users}/>
        )
    }
}
class UserList extends React.Component {
    render() {
        var users = this.props.users.map(user =>
            <User key={user._links.self.href} user={user}/>
        );
        return (
            <table className="table table-striped">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Nickname</th>
                    <th>Email</th>
                </tr>
                </thead>
                <tbody>
                    {users}
                </tbody>
            </table>
        )
    }
}
class User extends React.Component{
    render() {
        return (
            <tr>
                <td>{this.props.user.name}</td>
                <td>{this.props.user.age}</td>
                <td>{this.props.user.nickname}</td>
                <td>{this.props.user.email}</td>
            </tr>
        )
    }
}
ReactDom.render(<App />, document.getElementById('react'));