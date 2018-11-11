describe('My First Test', function() {
	it('Check', function() {
		cy.visit('https://example.cypress.io/commands/actions')

		cy.get('.action-email').type('lol@gmail.com').should('have.value', 'lol@gmail.com')
			.type('{backspace}').should(($a) => {
				expect('$a').to.not.contain('com').contain('co')
			})
		.clear().should('have.value', '')
		cy.get('.action-disabled').clear({force:true})
		.should('have.value', '')
		.should(($b) => {
			expect('abc').to.have.lengthOf(3)
		})
		.type('x', {force:true}).should('have.value', 'x').should('have.prop', 'disabled')
		cy.contains('.type()').click().url()
		cy.url().should('include', 'type')
	})
})
