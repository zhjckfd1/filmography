package testgroup.filmography.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;    //?
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import testgroup.filmography.model.Film;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;

@Repository
public class FilmDAOImpl implements FilmDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Film> allFilms() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Film").list();
    }

    @Override
    public void add(Film film) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(film);
    }

    @Override
    public void delete(Film film) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(film);
    }

    @Override
    public void edit(Film film) {
        Session session = sessionFactory.getCurrentSession();
        session.update(film);
    }

    @Override
    public Film getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Film.class, id);
    }


//    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
//    private static Map<Integer, Film> films = new HashMap<>();
//
//    private SessionFactory sessionFactory;
//
//    @Autowired
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    @Override
//   // @Transactional
//    @SuppressWarnings("unchecked")
//    public List<Film> allFilms() {
//        Session session = sessionFactory.getCurrentSession();
//        return session.createQuery("from Film").list();
//    }
////    static {
////        Film film1 = new Film();
////        film1.setId(AUTO_ID.getAndIncrement());
////        film1.setTitle("Inception");
////        film1.setYear(2010);
////        film1.setGenre("sci-fi");
////        film1.setWatched(true);
////        films.put(film1.getId(), film1);
////
////        Film film2 = new Film();
////        film2.setId(AUTO_ID.getAndIncrement());
////        film2.setTitle("Project");
////        film2.setYear(2014);
////        film2.setGenre("sci-fi");
////        film2.setWatched(false);
////        films.put(film2.getId(), film2);
////        // + film2, film3, film4, ...
////    }
//
////    @Override
////    public List<Film> allFilms() {
////        return new ArrayList<>(films.values());
////    }
//
//    @Override
//    public void add(Film film) {
//        film.setId(AUTO_ID.getAndIncrement());
//        films.put(film.getId(), film);
//    }
//
//    @Override
//    public void delete(Film film) {
//        films.remove(film.getId());
//    }
//
//    @Override
//    public void edit(Film film) {
//        films.put(film.getId(), film);
//    }
//
//    @Override
//    public Film getById(int id) {
//        return films.get(id);
//    }
}
