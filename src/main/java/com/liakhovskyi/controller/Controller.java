package com.liakhovskyi.controller;

import com.liakhovskyi.Request;
import com.liakhovskyi.ViewModel;


public interface Controller {

    ViewModel process(Request req);

}
