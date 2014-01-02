package org.devvapp.SampleRestEasyApplication;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlRootElement(name = "listing")
public class ItemList {

	@XmlElement(name = "items")
	private List<Item> items;

	public ItemList() {
	}

	public ItemList(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}
}