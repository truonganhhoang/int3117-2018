describe('Đăng nhập với gmail hoclieu.sachmem.vn  khi chưa đăng nhập tài khoản google', function() {
	it('Đi đến trang', function() {
		cy.visit('https://accounts.sachmem.vn/users/sign_in')
	})
	
	it("Vào phần 'Đăng nhập'",function() {
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
	it('"Google"', function() {
		cy.contains('Google').should('be.visitble')
	})
	it('Nhập tài khoản gmail', function() {
		cy.get('[type="email"]')
		  .type('main_user')
		  .should('has.value', 'mail_user')
	})
	
	it("Ấn 'Next'",function() {
		cy.contains('Next')
		   .should('be.visible')
	})
	
	it('Nhập mật khẩu gmail', function() {
		cy.get('[type="password"]')
		  .type('main_password')
		  .should('has.value', 'mail_password')
	})
	
	it("Ấn 'Next'",function() {
		cy.contains('Next')
		   .should('be.visible')
	})
});
