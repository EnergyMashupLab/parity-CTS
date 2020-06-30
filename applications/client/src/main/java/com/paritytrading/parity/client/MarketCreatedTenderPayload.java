/*
 * Copyright 2019-2020 The Energy Mashup Lab
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.paritytrading.parity.client;

/*
 * Sent by Market responding to MarketCreateTender from LME.
 * 
 * Includes CtsTenderId as a correlation ID
 */

public class MarketCreatedTenderPayload {
	long ctsTenderId;
	public Boolean success = false;	// Ensure set properly
	private String info = "ClientCreatedTenderPayload";
	private String parityOrderId;	// debug. Mapping in CtsBridge
	
	public String getParityOrderId() {
		return parityOrderId;
	}

	public void setParityOrderId(String parityOrderId) {
		this.parityOrderId = parityOrderId;
	}

	MarketCreatedTenderPayload(){
		success = true;
	}
	
	MarketCreatedTenderPayload(long id){
		ctsTenderId = id;
		this.success = true;
	}
	
	MarketCreatedTenderPayload(long ctsTenderId, String parityOrderId)	{
		this.ctsTenderId = ctsTenderId;
		this.parityOrderId = parityOrderId;
		this.success = true;
	}
	
	@Override
	public String toString()	{
		return (info + " success is " + success.toString() +
				" CtsTenderId " + Long.toString(ctsTenderId));
	}

	public long getCtsTenderId() {
		return ctsTenderId;
	}

	public void setCtsTenderId(long ctsTenderId) {
		this.ctsTenderId = ctsTenderId;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}