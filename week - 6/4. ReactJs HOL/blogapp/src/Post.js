import React, { Component } from 'react';

class Post {
  constructor(id, title, body) {
    this.id = id;
    this.title = title;
    this.body = body;
  }
}
export default Post;

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [] 
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(res => res.json())
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(err => console.error('Error fetching posts:', err));
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export { Posts };
