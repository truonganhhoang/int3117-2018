describe('Test return homepage hoclieu.sachmem.vn',function(){
	it('Visit', function(){
		cy.visit('https://hoclieu.sachmem.vn')
		cy.get('.logo').click()
		cy.url().should('include','https://hoclieu.sachmem.vn')
	})

})