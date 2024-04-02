# Girls Who Code - Interview Prep Program
Imagine you are a librarian and want to develop an inventory management system that keeps track of which
books are in the library and which ones have been checked out. The user should interact with the program using the command line interface. When you write your program, you should also consider its overall design. Your solution can be in a language of your choosing.

## Required Implementations
Write a program  with the following functionality:
- The user can print out a list of each book and its status (“on shelf” or “checked out”) 
- The user can add new books to the inventory. The default status of newly added books will be “on shelf”
- The user can toggle the status of each book between “on shelf” and “checked out”

## Optional Implementations
Additional features I have implemented to improve upon this program:
- Remove a book from library
- Search for a book from library
- Try-catch to control user-error inputs
- Regex to ensure user only inputs ~~13~~ 3 numbers for ISBN
- Program terminates when user specifies so
- Confirm with user before exiting

## In-Progress Implementations
Additional features I have thought off to implement:
- Keep track of the number of books in the inventory
- ISBN numerical strings must be unique
- Author must have first and last name
- User should only be able to checkout a book using ISBN or when they provide both title and author
- New book title and author must not match those already in library
- Let user know if book is present in library before removing
- Let user know if book is present in library before listing all books
