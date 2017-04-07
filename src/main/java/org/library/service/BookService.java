package org.library.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.library.pojo.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service("BookService")
@Transactional
public class BookService {


    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

//    public List<Book> getAll(){
//        Session session = sessionFactory.getCurrentSession();
//
//        // Create a Hibernate query (HQL)
//        Query query = session.createQuery("FROM  Book");
//
//        // Retrieve all
//        return  query.list();
//    }

    public Book get(Integer id ) {
        Session session = sessionFactory.getCurrentSession();
        Book book = (Book) session.get(Book.class, id);

        return book;
    }

    public void add(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.save(book);
    }

    public void delete(Integer id) {

        Session session = sessionFactory.getCurrentSession();
        Book book = (Book) session.get(Book.class, id);
        session.delete(book);

    }

    public void edit(Book book) {
        Session session = sessionFactory.getCurrentSession();
        Book existingBook = (Book) session.get(Book.class, book.getId());
        existingBook.setName(book.getName());
        existingBook.setDescription(book.getDescription());
        existingBook.setDownloadUrl(book.getDownloadUrl());
        existingBook.setImageUrl(book.getImageUrl());
        session.save(existingBook);
    }





}
