package edu.osu.cse5234.business.inventorymanagement;

import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("inventory")
public class InventoryManagementService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Inventory getInventory() {
		Inventory currentInventory = new Inventory();
		List<Item> availableItems = new ArrayList<Item>();
		
		String pic_url1 = "https://cdn.webshopapp.com/shops/221036/files/297679314/fooncase-iphone-11-pro-phone-case-tropical-desire.jpg";
		String pic_url2 = "https://m.media-amazon.com/images/I/418I24uGLlL.jpg";
		String pic_url3 = "https://cdn.shopify.com/s/files/1/1706/8353/products/here-comes-the-sun-colorblock-sunset-case-iphone-case-bold-iphone-12-pro-714397_800x.progressive.jpg?v=1631572203";
		String pic_url4 = "https://static.gibson.com/product-images/Gibson/APHL/APHL-IPXXS.png";
		String pic_url5 = "https://cdn-image02.casetify.com/usr/16571/16546571/~v30/13084976_iphone-x__color_silver_16000304.png.350x350-w.m80.jpg";
		String pic_url6 = "https://cdn.trendhunterstatic.com/thumbs/make-my-case.jpeg";
		
		availableItems.add(new Item(101, "iphone9Case", 0, 19.99, pic_url1));
		availableItems.add(new Item(102, "iphone10Case", 0, 24.99, pic_url2));
		availableItems.add(new Item(103, "iphone11Case", 0, 29.99, pic_url3));
		availableItems.add(new Item(104, "iphone12Case", 0, 29.99, pic_url4));
		availableItems.add(new Item(105, "iphone13Case", 0, 29.99, pic_url5));
		availableItems.add(new Item(106, "iphoneXCase", 0, 29.99, pic_url6));
		currentInventory.setItems(availableItems);
		return currentInventory;
	}
}
