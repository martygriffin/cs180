package edu.ucr.c3.business.ccr.imp;

import java.util.ArrayList;
import java.util.List;

import com.hibernate.Coupon;
import com.hibernate.CouponDAO;
import com.hibernate.Feedback;
import com.hibernate.Item;
import com.hibernate.ItemDAO;
import com.hibernate.Log;
import com.hibernate.LogDAO;
import com.hibernate.Menu;
import com.hibernate.MenuDAO;
import com.hibernate.MenuItem;
import com.hibernate.MenuItemDAO;
import com.hibernate.Order;
import com.hibernate.OrderDAO;
import com.hibernate.Reservation;
import com.hibernate.ReservationDAO;
import com.hibernate.Social;
import com.hibernate.SocialDAO;
import com.hibernate.User;
import com.hibernate.UserDAO;
import com.hibernate.Feedback;
import com.hibernate.FeedbackDAO;

import edu.ucr.c3.business.ccr.CCRService;
import edu.ucr.c3.phr.dao.AllergysDAO;
import edu.ucr.c3.phr.dao.CodingSystemDAO;
import edu.ucr.c3.phr.dao.CodingSystemsValueDAO;
import edu.ucr.c3.phr.dao.DepartmentDAO;
import edu.ucr.c3.phr.dao.DicomDAO;
import edu.ucr.c3.phr.dao.FilesDAO;
import edu.ucr.c3.phr.dao.HospitalDAO;
import edu.ucr.c3.phr.dao.ImmunizationDAO;
import edu.ucr.c3.phr.dao.InsuranceDAO;
import edu.ucr.c3.phr.dao.MeasurementDAO;
import edu.ucr.c3.phr.dao.ModalityDAO;
import edu.ucr.c3.phr.dao.NotesDAO;
import edu.ucr.c3.phr.dao.PhysicianDAO;
import edu.ucr.c3.phr.dao.ProblemDAO;
import edu.ucr.c3.phr.dao.ProceduresDAO;
import edu.ucr.c3.phr.dao.ResultsDAO;
import edu.ucr.c3.phr.dao.SimpleClinicalNoteDAO;
import edu.ucr.c3.phr.dao.VitalsDAO;

import edu.ucr.c3.phr.dao.MedicationDAO;
import edu.ucr.c3.phr.domain.Allergys;
import edu.ucr.c3.phr.domain.CodingSystemsValue;
import edu.ucr.c3.phr.domain.Department;
import edu.ucr.c3.phr.domain.Dicom;
import edu.ucr.c3.phr.domain.Files;
import edu.ucr.c3.phr.domain.Hospital;
import edu.ucr.c3.phr.domain.Immunization;
import edu.ucr.c3.phr.domain.Insurance;
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

import edu.ucr.c3.wms.business.SBRService;

public class CCRServiceImp extends SBRService implements CCRService {
	private MenuDAO menuDAO;
	private OrderDAO orderDAO;
	private UserDAO userDAO;
	private ReservationDAO reservationDAO;
	private ItemDAO itemDAO;
	private SocialDAO socialDAO;
	private MenuItemDAO menuItemDAO;
	private CouponDAO couponDAO;
	private FeedbackDAO feedbackDAO;

	public FeedbackDAO getFeedbackDAO() {
		return feedbackDAO;
	}

	public void setFeedbackDAO(FeedbackDAO feedbackDAO) {
		this.feedbackDAO = feedbackDAO;
	}

	private LogDAO logDAO;

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setMenuDAO(MenuDAO menuDAO) {
		this.menuDAO = menuDAO;
	}

	public LogDAO getLogDAO() {
		return logDAO;
	}

	public void setLogDAO(LogDAO logDAO) {
		this.logDAO = logDAO;
	}
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		List<Order> all = orderDAO.findAll();
		List temp = new ArrayList();
		for (Order e : all) {
			if (e.getIsActive())
				temp.add(e);
		}
		return temp;
	}



	public List<Order> getAllCompletedOrders() {
		// TODO Auto-generated method stub
		List<Order> all = orderDAO.findAll();
		List temp = new ArrayList();
		for (Order e : all) {
			if (e.getIsActive()&&e.getStatus().equals("Completed") )
				temp.add(e);
		}
		return temp;
	}

	public List<Order> getAllUnfilledOrders() {
		// TODO Auto-generated method stub
		List<Order> all = orderDAO.findAll();
		List temp = new ArrayList();
		if(all.size()>0)
		{
		for (Order e : all) {
			System.out.println(e.getStatus() +e.getIsDelivery() +e.getIsDelivery() +e.getIsTogo() +e.getOrderPassword());
		
			if (e.getIsActive()&&e.getStatus().equals("Unfilled"))
				temp.add(e);
		}
		return temp;
		}
		return all;
	}
	public void saveOrder(Order o)
	{
		orderDAO.save(o);
	}
	

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	

	public List<User> findByUsername(String username) {
		// TODO Auto-generated method stub
		List<User> temp =userDAO.findByUsername(username);
		List<User> result = new ArrayList();
		for(User u : temp)
		{
			if(u.getIsActive())
			{
				result.add(u);
			}
		}
		return result;
		
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	public Order findOrderbyID(int id) {
		// TODO Auto-generated method stub
		return orderDAO.findById(id);
	}

	public List<Reservation> getCurrentReservations() {
		// TODO Auto-generated method stub
		List<Reservation> all = reservationDAO.findAll();
		List temp = new ArrayList();
		for (Reservation e : all) {
			if (e.getIsActive() )
				temp.add(e);
		}
		return temp;
	}

	public ReservationDAO getReservationDAO() {
		return reservationDAO;
	}

	public void setReservationDAO(ReservationDAO reservationDAO) {
		this.reservationDAO = reservationDAO;
	}
	
	public List<Reservation> getAllDeletedReservations() {
		List<Reservation> restemp = reservationDAO.findAll();
		List<Reservation> returnlist = new ArrayList();
		for ( Reservation e: restemp){
			if( !e.getIsActive() ) {
				returnlist.add(e);
			}
		}
		return returnlist;
	}

	public Reservation getReservationByID(int id) {
		return reservationDAO.findById(id);
	}


	
	public List<Menu> getAllMenus() {
		List<Menu> menutemp = menuDAO.findAll();
		List<Menu> returnlist = new ArrayList();
		for (Menu e: menutemp){
			if( e.getIsActive() ) {
				returnlist.add(e);
			}
		}
		return returnlist;
	}
	
	public List<Menu> getAllDeletedMenus() {
		List<Menu> menutemp = menuDAO.findAll();
		List<Menu> returnlist = new ArrayList();
		for (Menu e: menutemp){
			if( !e.getIsActive() ) {
				returnlist.add(e);
			}
		}
		return returnlist;		
	}
	
	public void saveMenu(Menu m) {
		menuDAO.save(m);
	}
	
	public MenuDAO getMenuDAO() {
		return menuDAO;
	}


	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}

	public ItemDAO getItemDAO() {
		return itemDAO;
	}

	public void saveReservation(Reservation r) {
		reservationDAO.save(r);
		
	}

	public void deleteOrder(Order o) {
		o.setIsActive(false);
		orderDAO.save(o);
		
	}

	public List<Order> getAllDeletedOrders() {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			List<Order> all = orderDAO.findAll();
			List temp = new ArrayList();
			for (Order e : all) {
				if (!e.getIsActive() )
					temp.add(e);
			}
			return temp;
		
	}

	public Menu getMenuByID(int id) {
		return menuDAO.findById(id);
	}

	public List<Social> getAllSocial() {
		// TODO Auto-generated method stub
		List<Social> temp =socialDAO.findAll();
		List<Social> social = new ArrayList();
		for(Social s: temp)
		{
			if(s.getIsActive())
				social.add(s);
		}
		return social;
	}

	public void setSocialDAO(SocialDAO socialDAO) {
		this.socialDAO = socialDAO;
	}

	public SocialDAO getSocialDAO() {
		return socialDAO;
	}
	
	public List<Item> getAllItems() {
		List<Item> itemtemp = itemDAO.findAll();
		List<Item> returnlist = new ArrayList();
		for (Item e: itemtemp){
			if( e.getIsActive() ) {
				returnlist.add(e);
			}
		}
		return returnlist;
	}

	public List<Item> getAllDeletedItems() {
		List<Item> itemtemp = itemDAO.findAll();
		List<Item> returnlist = new ArrayList();
		for (Item e: itemtemp){
			if( !e.getIsActive() ) {
				returnlist.add(e);
			}
		}
		return returnlist;

	}

	public Item getItemByID(int id) {
		return itemDAO.findById(id);
	}

	public void saveItem(Item i) {
		itemDAO.save(i);		
	}

	
	
	public User getUserByID(int id) {
		return userDAO.findById(id);
	}

	public List<User> getActiveAdmins() {
		List<User> usertemp = userDAO.findAll();
		List<User> returnlist = new ArrayList();
		for (User e: usertemp){
			if( e.getIsActive() && e.getIsAdmn() ) {
				returnlist.add(e);
			}
		}
		return returnlist;
	}

	public List<User> getInactiveAdmins() {
		List<User> usertemp = userDAO.findAll();
		List<User> returnlist = new ArrayList();
		for (User e: usertemp){
			if( !e.getIsActive() && e.getIsAdmn() ) {
				returnlist.add(e);
			}
		}
		return returnlist;

	}

	public void saveUser(User u) {
		userDAO.save(u);
	}

	public List<Log> getLog() {
		// TODO Auto-generated method stub
		return logDAO.findAll();
	
	}

	public void saveLogEntry(Log e) {
		// TODO Auto-generated method stub
		logDAO.save(e);
	}

	public void saveSocial(Social s) {
		// TODO Auto-generated method stub
		socialDAO.save(s);
		
	}

	public void setSocialInactive(Social s) {
		// TODO Auto-generated method stub
		s.setIsActive(false);
		socialDAO.save(s);
	}

	public Social getSocialById(int id) {
		// TODO Auto-generated method stub
		return socialDAO.findById(id);
	}

	public List<Social> getAllInactiveSocial() {
		List<Social> temp =socialDAO.findAll();
		List<Social> social = new ArrayList();
		for(Social s: temp)
		{
			if(!s.getIsActive())
				social.add(s);
		}
		return social;// TODO Auto-generated method stub
		


	}

	public void setMenuItemDAO(MenuItemDAO menuItemDAO) {
		this.menuItemDAO = menuItemDAO;
	}

	public MenuItemDAO getMenuItemDAO() {
		return menuItemDAO;
	}

	public void saveMenuItem(MenuItem m) {
		menuItemDAO.save(m);
		
	}

	public List<Item> getItemByName(String name) {
		// TODO Auto-generated method stub
		return itemDAO.findByName(name);
	}



	public void deleteMenuItem(MenuItem m) {
		 menuItemDAO.delete(m);
		
	}

	public MenuItem findMenuItemByID(int id) {
		// TODO Auto-generated method stub
		return menuItemDAO.findById(id);
	}

	public List<Menu> findMenuByName(String name) {
		
		return menuDAO.findByMenuName(name);
	}

	public Coupon findCouponbyId(int id) {
		// TODO Auto-generated method stub
		return couponDAO.findById(id);
	}

	public CouponDAO getCouponDAO() {
		return couponDAO;
	}

	public void setCouponDAO(CouponDAO couponDAO) {
		this.couponDAO = couponDAO;
	}

	public List<Coupon> getAllActiveCoupon() {
		// TODO Auto-generated method stub
		List<Coupon> itemtemp = couponDAO.findAll();
		List<Coupon> returnlist = new ArrayList();
		for (Coupon e: itemtemp){
			if( e.getIsActive() &&e.getNumUsesAllowed()>=1 ) {
				returnlist.add(e);
			}
		}
		return returnlist;

	}

	public List<Coupon> getAllInactiveCoupon() {
		// TODO Auto-generated method stub
		List<Coupon> itemtemp = couponDAO.findAll();
		List<Coupon> returnlist = new ArrayList();
		for (Coupon e: itemtemp){
			if( !e.getIsActive() ) {
				returnlist.add(e);
			}
		}
		return returnlist;

	}

	public void saveCoupon(Coupon c) {
		couponDAO.save(c);
		
	}

	public void setCouponInactive(Coupon c) {
		// TODO Auto-generated method stub
		if(!couponDAO.findByExample(c).isEmpty())
		{
		Coupon temp = (Coupon) couponDAO.findByExample(c).get(0);
		c.setIsActive(false);
		couponDAO.save(temp);
		}
	}

	public Feedback getFeedbackByID(int id) {
		return feedbackDAO.findById(id);
	}

	public List<Feedback> getAllActiveFeedback() {
		List<Feedback> feedbacktemp = feedbackDAO.findAll();
		List<Feedback> returnlist = new ArrayList();
		for (Feedback e: feedbacktemp) {
			if ( e.getIsActive() ) {
				returnlist.add(e);
			}
		}
		return returnlist;
	}

	public List<Feedback> getAllDeletedFeedback() {
		List<Feedback> feedbacktemp = feedbackDAO.findAll();
		List<Feedback> returnlist = new ArrayList();
		for (Feedback e: feedbacktemp) {
			if ( !e.getIsActive() ) {
				returnlist.add(e);
			}
		}
		return returnlist;
	}

	public void saveFeedback(Feedback f) {
		feedbackDAO.save(f);
	}

	public List<Coupon> findByCouponCode(String code) {
		List<Coupon> temp = couponDAO.findByCouponCode(code);
		List<Coupon>result = new ArrayList();
		for(Coupon c : temp)
		{
			if(c.getIsActive())
			{
				result.add(c);
			}
		}
		return result;
	}

	public List<Coupon> findCouponByName(String name) {
		List<Coupon> temp = couponDAO.findByName(name);
		List<Coupon>result = new ArrayList();
		for(Coupon c : temp)
		{
			if(c.getIsActive())
			{
				result.add(c);
			}
		}
		return result;
	}

	public List<MenuItem> getAllMenuItems(int menu_id) {
		List<MenuItem> menuitemtemp = menuItemDAO.findAll();
		List<MenuItem> returnlist = new ArrayList();
		for (MenuItem e: menuitemtemp) {
			if ( e.getIsActive() && e.getMenu().getMenuId() == menu_id ) {
				returnlist.add(e);
			}
		}
		return returnlist;
		
	}

	
}
