/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.TextService;
import entity.SingleText;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hasome
 */
@Service
public class TextServiceImpl implements TextService {

   @Autowired
    private SessionFactory sessionFactory;

    @Transactional 
   @Override
    public SingleText test() {

        Session session = sessionFactory.getCurrentSession();
        SingleText st = (SingleText) session.get(SingleText.class, 1);
       return st;
    }
}
