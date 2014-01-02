package org.devvapp.SampleRestEasyApplication;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("tutorial")
public class HelloWorld {

	@GET
	@Path("helloname/{name}")
	public String helloworld(@PathParam("name") final String name) {
		return "Hello " + name;
	}

	@GET
	@Path("/items")
	@Produces(MediaType.APPLICATION_XML)
	public ItemList getItem() {

		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("computer", 2500));
		items.add(new Item("chair", 100));

		return new ItemList(items);
	}

}
