package com.csd.mail;

import static com.csd.mail.StringListInAnyOrder.stringListInAnyOrder;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListInAnyOrderTest {

	@Test
	public void sameEmptyList() {
		List<String> lista1 = Arrays.asList();
		List<String> lista2 = Arrays.asList();
		assertThat(lista1, stringListInAnyOrder(lista2));
	}

	@Test
	public void sameListWithOneElement() {
		List<String> lista1 = Arrays.asList("elem1");
		List<String> lista2 = Arrays.asList("elem1");
		assertThat(lista1, stringListInAnyOrder(lista2));
	}

	@Test
	public void differentListWithOneElement() {
		List<String> lista1 = Arrays.asList("elem1");
		List<String> lista2 = Arrays.asList("elem2");
		assertThat(lista1, not(stringListInAnyOrder(lista2)));
	}

	// @Test
	// public void sameListUnordered() {
	// List<String> lista1 = Arrays.asList("elm2", "elm1");
	// List<String> lista2 = Arrays.asList("elm1", "elm2");
	// assertThat(lista1, stringListInAnyOrder(lista2));
	// }

}
