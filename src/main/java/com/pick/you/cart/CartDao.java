package com.pick.you.cart;

import java.util.List;


public interface CartDao {
	
	   // 1. 장바구니 추가
	   void  insert(CartVO vo); 
	  
	   // 2. 장바구니 목록보기
	   List<CartVO>  getCartList(CartVO vo);
	   
	   // 3. 장바구니 삭제
	   void  delete(CartVO vo); 
	   
	   // 4. 장바구니 수정
	   void  update(CartVO vo); 
	   
	   // 5. 장바구니 금액합계
	   int  sumMoney(String user_id);
	      
	   // 6. 장바구니 동일 상품 레코드 확인
	   int  countCart(int product_id, String user_id );
	   
	   //7. 사용자 장바구니 확인
	   int selectcidxCount(CartVO vo);
	   
	   // 8. 장바구니 전체삭제 
	   void cartAllDelete(CartVO vo);
}
