beforeEach(() => {
    cy.visit('https://www.pokemon.com/us/pokedex/');
})
describe('CypressIO', function() {
    it('Check Pokemon photo', function() {
        cy.get(".results > li img")
          .should('have.attr', 'src');
    })
	
	it('Check Pokemon information', function(){
		cy.get(".results > li a")
			.should('have.attr', 'href');
	})
}) 