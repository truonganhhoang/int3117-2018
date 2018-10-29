describe('Test login hoclieu.sachmem.vn', function() {
	it('Visit sach mem', function() {
		cy.visit('https://accounts.sachmem.vn/users/sign_in')
	})
	
	it("Test contain 'Đăng nhập'",function() {
		cy.contains('Đăng nhập')
		   .should('be.visible')
	})
	it('Test input email', function() {
		cy.get('#user_email')
		  .type('quannv0510@gmail.com')
		  .should('has.value', 'quannv0510@gmail.com')
	})
	it('Test input password', function() {
		cy.get('#user_password')
		  .type('05101998')
		  .should('has.value', '05101998')
	})
	it('Test checkbox', function() {
		cy.get('[type="checkbox"]').check('1')
	})
	it('Test button "Đăng nhập"', function() {
		cy.get('[type="submit"]').click()
	})
});