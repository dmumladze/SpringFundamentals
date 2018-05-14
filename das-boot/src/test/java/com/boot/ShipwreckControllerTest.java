package com.boot;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import com.boot.controller.ShiprwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

public class ShipwreckControllerTest {
	
	@InjectMocks
	private ShiprwreckController controller;
	
	@Mock
	private ShipwreckRepository repository; 
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testShipwreckGet() {
		Shipwreck sw = new Shipwreck();
		sw.setId(1L);		
		when(this.repository.getOne(1L)).thenReturn(sw);		
		Shipwreck wreck = this.controller.get(1L);		
		verify(this.repository).getOne(1L);		
		//assertEquals(1L, wreck.getId().longValue());
		assertThat(wreck.getId(), is(1L));
	}
	
}
