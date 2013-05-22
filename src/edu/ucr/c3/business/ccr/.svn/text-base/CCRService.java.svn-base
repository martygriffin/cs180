package edu.ucr.c3.business.ccr;

import java.util.List;

import com.hibernate.Coupon;
import com.hibernate.Item;
import com.hibernate.Log;
import com.hibernate.Menu;
import com.hibernate.MenuItem;
import com.hibernate.Order;
import com.hibernate.Reservation;
import com.hibernate.Social;
import com.hibernate.User;
import com.hibernate.Feedback;

import edu.ucr.c3.phr.domain.Allergys;
import edu.ucr.c3.phr.domain.CodingSystemsValue;
import edu.ucr.c3.phr.domain.Department;
import edu.ucr.c3.phr.domain.Dicom;
import edu.ucr.c3.phr.domain.Files;
import edu.ucr.c3.phr.domain.Hospital;
import edu.ucr.c3.phr.domain.Immunization;
import edu.ucr.c3.phr.domain.Insurance;
import edu.ucr.c3.phr.domain.Login;
import edu.ucr.c3.phr.domain.Actors;
import edu.ucr.c3.phr.domain.Measurement;
import edu.ucr.c3.phr.domain.Medication;
import edu.ucr.c3.phr.domain.Modality;
import edu.ucr.c3.phr.domain.Notes;
import edu.ucr.c3.phr.domain.Physician;
import edu.ucr.c3.phr.domain.Problem;
import edu.ucr.c3.phr.domain.Procedures;
import edu.ucr.c3.phr.domain.Results;
import edu.ucr.c3.phr.domain.SimpleClinicalNote;
import edu.ucr.c3.phr.domain.Vitals;
import edu.ucr.c3.wms.business.SBRException;


public interface CCRService {
//Menu Functions
	public void saveMenu(Menu m);
	public List<Menu> getAllMenus();
	public List<Menu> getAllDeletedMenus();
	public Menu getMenuByID(int id);
	public List<Menu> findMenuByName(String name);
	//public List<Menu> getAllMenus();
//Order Fucntioins
	public List<Order> getAllOrders();
	public List<Order> getAllUnfilledOrders();
	public List<Order> getAllCompletedOrders();
	public List<Order> getAllDeletedOrders();
	public Order findOrderbyID(int id);
	public void saveOrder(Order o);
	public void deleteOrder(Order o);
//User functions
	public List<User> getAllUsers();
	public List<User> findByUsername(String username); 
	public List<User> getActiveAdmins();
	public void saveUser(User u);
	public List<User> getInactiveAdmins();
	public User getUserByID(int id);
//Reservation Functions
	public List<Reservation> getCurrentReservations();
	public void saveReservation(Reservation r);
	public List<Reservation> getAllDeletedReservations();
	public Reservation getReservationByID(int id);
	
//Item Functions
	public List<Item> getAllItems();
	public void saveItem(Item i);
	public List<Item> getAllDeletedItems();
	public Item getItemByID(int id);
	public List<Item> getItemByName(String name);

	
//Social Functions
	public List<Social> getAllSocial();
	public List<Social> getAllInactiveSocial();
	public void saveSocial(Social s);
	public void setSocialInactive(Social s);
	public Social getSocialById(int id);
	
//Log Functions
	public List<Log> getLog();
	public void saveLogEntry(Log e);
//Menu Item Functions
	public void saveMenuItem(MenuItem m);
	public void deleteMenuItem(MenuItem m);
	public MenuItem findMenuItemByID(int id);
	public List<MenuItem> getAllMenuItems(int menu_id);
//Coupon Fuctions
	public List<Coupon>getAllActiveCoupon();
	public List<Coupon>getAllInactiveCoupon();
	public Coupon findCouponbyId(int id);
	public void setCouponInactive(Coupon c);
	public void saveCoupon(Coupon c);
	
//Feedback Functions
	public List<Feedback> getAllActiveFeedback();
	public List<Feedback> getAllDeletedFeedback();
	public Feedback getFeedbackByID(int id);
	public void saveFeedback(Feedback f);
	public List<Coupon> findCouponByName(String name);
	public List<Coupon> findByCouponCode(String code);	
	
}