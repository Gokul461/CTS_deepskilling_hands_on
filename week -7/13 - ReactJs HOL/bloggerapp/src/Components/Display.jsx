import React from 'react'
import './Display.css';
import Books from './Books';
import Blog from './Blog';
import Course from './Course';

const bookdet = (
    <ul>
        {Books.map((book) => (
            <div key={book.id}>
                <h3>{book.bname}</h3>
                <h4>{book.price}</h4>
            </div>
        ))}
    </ul>
)

const blogdet = (
    <ul>
        {Blog.map((blog) => (
            <div key={blog.id}>
                <h3>{blog.title}</h3>
                <h4>{blog.content}</h4>
            </div>
        ))}
    </ul>
)

const coursedet = (
    <ul>
        {Course.map((course) => (
            <div key={course.id}>
                <h3>{course.title}</h3>
                <h4>{course.date}</h4>
            </div>
        ))}
    </ul>
)

function Display() {
    return (
        <div className='dis'>
        <div className='container'>
            <div className='column'>
                <h1>Book Details</h1>
                {bookdet}
            </div>
            <div className='divider'></div>
            <div className='column'>
                <h1>Blog Details</h1>
                {blogdet}
            </div>
            <div className='divider'></div>
            <div className='column'>
                <h1>Course Details</h1>
                {coursedet}
            </div>
        </div>
        </div>
    )
}

export default Display;
