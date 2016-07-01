package com.Priyanka.pageObjects;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class signInPage {

    public signInPage() {

    }

    public signInPage enterEmailAddressPassword() {
        return new signInPage();// Need to understand why a new signInPage is returned
                                // We are already on signInPage. Why is a new signInPage returned?
    }

    public shippingAddressPage enterShippingAddress() {
        return new shippingAddressPage();
    }
}
