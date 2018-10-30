describe('hoclieu.sachmem.vn', function() {
	it('Đi đến trang', function() {
		cy.visit('https://accounts.sachmem.vn/users/sign_in')
	})
	
	it("Kiểm tra đăng nhập 'Đăng nhập'",function() {
		cy.contains('Đăng nhập')
		   .should('be.visible')
	})
	it('Nhập email', function() {
		cy.get('#user_email')
		  .type('vuvanquy1998@gmail.com')
		  .should('has.value', 'vuvanquy1998@gmail.com')
	})
	it('Nhập password', function() {
		cy.get('#user_password')
		  .type('154311998')
		  .should('has.value', '154311998')
	})
	it('nhớ tài khoản', function() {
		cy.get('#user_remember_me').check('1')
	})
	it('"Đăng nhập"', function() {
		cy.get('[type="submit"]').click()
	})
});