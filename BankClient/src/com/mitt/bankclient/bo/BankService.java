package com.mitt.bankclient.bo;

import java.util.ArrayList;

import com.mitt.bankclient.vo.BankVO;


public interface BankService {
	public void addBankInfo(BankVO bvo)throws Exception;
	public BankVO[] getAllBankInfo();
	
}
