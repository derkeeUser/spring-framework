package org.springframework.transaction.cxm;

import org.springframework.tests.sample.beans.TestBean;
import org.springframework.transaction.annotation.Transactional;

/**
 * @BelongProjecet spring
 * @BelongPackage org.springframework.transaction.cxm
 * @Description: 用于调试
 * @Author: chenxiaoming
 * @Date: 2022/9/15 14:37
 */
public class TestBean2 extends TestBean {
	@Transactional
	@Override
	public Object returnsThis() {
		// test1();
		return super.returnsThis();
	}

	// @Transactional
	// public void test1() {
	//
	// }
}
